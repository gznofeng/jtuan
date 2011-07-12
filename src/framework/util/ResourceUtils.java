package framework.util;

import java.io.File;

public class ResourceUtils {
	
	public static String getClassPath(){
		String clzPath=ResourceUtils.class.getResource("/").getPath();
		if(clzPath.indexOf("/")==0){
			clzPath=clzPath.replaceFirst("/", "");
		}
		return clzPath;
	}
		
	public static String packageToPath(String packageStr){
		return packageStr.replaceAll("\\.","/");
	}
	public static String pathToPackage(String pathStr){
		return pathStr.replaceAll("\\/",".");
	}
	
	public static void main(String[] args) {
System.out.println("/E:/workspace-play/EU/WebRoot/WEB-INF/classes/".replaceFirst("/",""));
		System.out.println(ResourceUtils.getClassPath());
		System.out.println(ResourceUtils.packageToPath("cn.test.module"));
		System.out.println(ResourceUtils.pathToPackage("cn/test/module"));
	}

}
