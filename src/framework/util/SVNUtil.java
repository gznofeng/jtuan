package framework.util;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

import org.tmatesoft.svn.core.SVNCommitInfo;
import org.tmatesoft.svn.core.SVNDirEntry;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNNodeKind;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.ISVNOptions;
import org.tmatesoft.svn.core.wc.SVNClientManager;
import org.tmatesoft.svn.core.wc.SVNCopySource;
import org.tmatesoft.svn.core.wc.SVNRevision;
import org.tmatesoft.svn.core.wc.SVNUpdateClient;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

public class SVNUtil {
	private String svnRoot;

	private String userName;

	private String password;

	private SVNRepository repository;
	
	private SVNClientManager clientManager;


	/***************************************************************************
	 * 
	 * 构造方法
	 * 
	 * @param svnRoot
	 * 
	 * svn根目录
	 * 
	 */

	public SVNUtil(String svnRoot) {

		this.svnRoot = svnRoot;

	}

	/***************************************************************************
	 * 
	 * 构造方法
	 * 
	 * @param svnRoot
	 * 
	 * svn根目录
	 * 
	 * @param userName
	 * 
	 * 登录用户名
	 * 
	 * @param password
	 * 
	 * 登录密码
	 * 
	 */

	public SVNUtil(String svnRoot, String userName, String password) {

		this.svnRoot = svnRoot;

		this.userName = userName;

		this.password = password;

	}

	/***************************************************************************
	 * 
	 * 通过不同的协议初始化版本库
	 * 
	 */

	private static void setupLibrary() {

		// 对于使用http://和https：//

		DAVRepositoryFactory.setup();

		// 对于使用svn：/ /和svn+xxx：/ /

		SVNRepositoryFactoryImpl.setup();

		// 对于使用file://

		FSRepositoryFactory.setup();

	}

	/***************************************************************************
	 * 
	 * 登录验证
	 * 
	 * @return
	 * 
	 */

	public boolean login() {
		
		

		setupLibrary();

		try {

			// 创建库连接

			repository = SVNRepositoryFactory.create(SVNURL.parseURIEncoded(this.svnRoot));

			// 身份验证

			ISVNAuthenticationManager authManager = SVNWCUtil

			.createDefaultAuthenticationManager(this.userName,

			this.password);

			// 创建身份验证管理器

			repository.setAuthenticationManager(authManager);
			
			ISVNOptions options = SVNWCUtil.createDefaultOptions( true );

	        /*
	         * Creates an instance of SVNClientManager providing a default auth 
	         * manager and an options driver
	         */
	        clientManager = SVNClientManager.newInstance( options , authManager );


			return true;

		} catch (SVNException svne) {

			svne.printStackTrace();

			return false;

		}

	}

	/***************************************************************************
	 * 
	 * 
	 * 
	 * @param path
	 * 
	 * @return 查询给定路径下的条目列表
	 * 
	 * @throws SVNException
	 * 
	 */

	public static void listEntries( SVNRepository repository, String path ) throws SVNException {
        Collection entries = repository.getDir( path, -1 , null , (Collection) null );
        Iterator iterator = entries.iterator( );
        while ( iterator.hasNext( ) ) {
            SVNDirEntry entry = ( SVNDirEntry ) iterator.next( );
            System.out.println( "/" + (path.equals( "" ) ? "" : path + "/" ) + entry.getName( ) + 
                               " ( author: '" + entry.getAuthor( ) + "'; revision: " + entry.getRevision( ) + 
                               "; date: " + entry.getDate( ) + ")" );
            if ( entry.getKind() == SVNNodeKind.DIR ) {
                listEntries( repository, ( path.equals( "" ) ) ? entry.getName( ) : path + "/" + entry.getName( ) );
            }
        }
    }
	
	private  long switchToURL( File wcPath , SVNURL url , SVNRevision updateToRevision , boolean isRecursive ) throws SVNException {
        SVNUpdateClient updateClient = clientManager.getUpdateClient( );
        /*
         * sets externals not to be ignored during the switch
         */
        updateClient.setIgnoreExternals( false );
        /*
         * returns the number of the revision wcPath was updated to
         */
        return updateClient.doSwitch( wcPath , url , updateToRevision , isRecursive );
    }
    /*
    * 
    * @param  sources               array of copy sources 
    * @param  dst                   destination url
    * @param  isMove                if <span class="javakeyword">true</span>, then it will be a move operation 
    *                               (delete, then add with history)                 
    * @param  makeParents           if <span class="javakeyword">true</span>, creates non-existent parent 
    *                               directories as well
    * @param  failWhenDstExists     controls whether to fail or not if <code>dst</code> already exists
    * @param  commitMessage         commit log message
    * @param  revisionProperties    custom revision properties
    * @return                       information about the new committed revision 
    * @throws SVNException          
    * @since                        1.2, SVN 1.5
    * */
	public  SVNCommitInfo copy( SVNCopySource srcURL , SVNURL dstURL , boolean isMove , String commitMessage ) throws SVNException {
		SVNCopySource[] copySources={srcURL};
        return clientManager.getCopyClient().doCopy( copySources ,dstURL, isMove ,true,true, commitMessage ,null);
    }



	public static void main(String[] args) {
		try {
			String url="http://www.svnchina.com/svn/foolishwork";
			String user="gznofeng";
			String pwd="nofeng";
			SVNUtil svnUtil=new SVNUtil(url,user,pwd);
			System.out.println(svnUtil.login());
			System.out.println( "Repository Root: " + svnUtil.getRepository().getRepositoryRoot( true ) );
			svnUtil.listEntries(svnUtil.getRepository(),"");
			
			String form="http://www.svnchina.com/svn/foolishwork/trunk/";
			String to="http://www.svnchina.com/svn/foolishwork/args/branch/v1.0";
			System.out.println( "Copying '" + form + "' to '" + to + "'..." );
			SVNURL repositoryURL = null;
	        try {
	            repositoryURL = SVNURL.parseURIEncoded(form );
	        } catch ( SVNException e ) {
	            //
	        }
	        
	        SVNURL toURL = null;
	        try {
	        	toURL = SVNURL.parseURIEncoded( to );
	        } catch ( SVNException e ) {
	            //
	        }
	        SVNCopySource copySource=new SVNCopySource(SVNRevision.UNDEFINED, SVNRevision.HEAD,repositoryURL);


			svnUtil.copy(copySource, toURL, false, "测试copy to");

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	public String getSvnRoot() {
		return svnRoot;
	}

	public void setSvnRoot(String svnRoot) {
		this.svnRoot = svnRoot;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SVNRepository getRepository() {
		return repository;
	}

	public void setRepository(SVNRepository repository) {
		this.repository = repository;
	}
}
