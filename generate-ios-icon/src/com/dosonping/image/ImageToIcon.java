package com.dosonping.image;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageToIcon {
	public static void main(String[] args) throws IOException {
		//====================================================
		//道桥养护app  部分start
//		String fileName = "D:\\bmrb\\道桥养护app\\二期\\icon0115.png";
//		String targetFloat = "D:\\bmrb\\道桥养护app\\二期\\icon\\";
//		ImageToIcon.scaleIcons(fileName, targetFloat);
//		String targetFloatIconSet = "D:\\bmrb\\道桥养护app\\二期\\icon\\iconset\\";
//		ImageToIcon.scaleIconsForAppiconset(fileName, targetFloatIconSet);
//		String targetFloatImageset = "D:\\bmrb\\道桥养护app\\二期\\icon\\imageset\\";
//		ImageToIcon.scaleIconsForAppImageset(fileName, targetFloatImageset);
//		String fileName = "D:\\bmrb\\道桥养护app\\二期\\启动图片\\ios\\20481496.png";
//		String targetFloat = "D:\\bmrb\\道桥养护app\\二期\\splash\\";
//		ImageToIcon.cutIcons(fileName, targetFloat);
//		String targetFloatAppStore = "D:\\bmrb\\道桥养护app\\二期\\icon\\appstoreicon\\";
//		ImageToIcon.scaleIconsForAppStore(fileName, targetFloatAppStore);
		//道桥养护app  部分end
		
		
		//======================================================================
		//国道通OAApp部分start
//		String fileName = "D:\\bmrb\\国道通OA_App\\图标\\国道通1024.png";
//		String targetFloat = "D:\\bmrb\\国道通OA_App\\icon\\";
//		ImageToIcon.scaleIcons(fileName, targetFloat);
		generateGdtOaAppIcon();
//		String targetFloatIconSet = "D:\\bmrb\\国道通OA_App\\icon\\iconset\\";
//		ImageToIcon.scaleIconsForAppiconset(fileName, targetFloatIconSet);
//		String targetFloatImageset = "D:\\bmrb\\国道通OA_App\\icon\\imageset\\";
//		ImageToIcon.scaleIconsForAppImageset(fileName, targetFloatImageset);
//		String targetFloatAppStore = "D:\\bmrb\\国道通OA_App\\icon\\appstoreicon\\";
//		ImageToIcon.scaleIconsForAppStore(fileName, targetFloatAppStore);	
//		String fileName = "D:\\bmrb\\国道通OA_App\\启动图片\\ios\\20481496.png";
//		String targetFloat = "D:\\bmrb\\国道通OA_App\\splash\\";
//		ImageToIcon.cutIcons(fileName, targetFloat);
		//国道通OAApp部分 end
		
		//hdApp
		//generateHdAppIcon();
		//二部OAApp
		//generateErbuOaAppIcon();
		//都市绿源OAApp
		//generateDslyOaAppIcon();
		//三站一场管理系统App
		//generateMixingplantAppIcon();
		//一部OAapp
		//generateYibuOaAppIcon();
		
		
		
		
		//生产启动图片 宽大于高
//		String fileName = "E:\\cuifuping\\SynologyDrive\\bmrb\\国道通OA_App\\启动图画\\6236X2881.png";
//		String targetFloat = "E:\\cuifuping\\SynologyDrive\\bmrb\\国道通OA_App\\启动图画\\splash\\";
//		ImageToIcon.cutIcons(fileName, targetFloat);
//		String fileName2 = "E:\\cuifuping\\SynologyDrive\\bmrb\\国道通OA_App\\启动图画\\11252436.png";
//		String targetFloat2 = "E:\\cuifuping\\SynologyDrive\\bmrb\\国道通OA_App\\启动图画\\splash\\";
//		ImageToIcon.cutIconsHeight(fileName2, targetFloat2);
		

	}
	private static void generateGdtOaAppIcon() throws IOException {
		System.out.println("开始生产国道通OAappicon的图标");
		String rootPath = "E:\\cuifuping\\SynologyDrive\\bmrb\\国道通OA_App\\icon\\";	
		String fileName = "E:\\cuifuping\\SynologyDrive\\bmrb\\国道通OA_App\\图标\\国道通1024.png";
		generateIcons(rootPath, fileName);
		System.out.println("完成生产国道通OAappicon的图标");
	}
	/**
	 * 一部OAapp
	 * @date Dec 15, 2020
	 * @author cuifuping
	 * @throws IOException 
	 */
	private static void generateYibuOaAppIcon() throws IOException {
		String rootPath = "E:\\cuifuping\\SynologyDrive\\bmrb\\一部OA_App\\";
		String fileName = rootPath + "icon.png";
		generateIcons(rootPath, fileName);
	}
	
	/**
	 * 三站一场管理系统App
	 * @datetime 2019年10月18日 下午4:02:34
	 * @author 崔富平
	 * @throws IOException 
	 */
	private static void generateMixingplantAppIcon() throws IOException {
		String rootPath = "D:\\bmrb\\三站一场管理系统App\\";
		String fileName = rootPath + "icon.png";
		generateIcons(rootPath, fileName);
	}
	/**
	 * 都市绿源OAApp
	 * @throws IOException
	 * @datetime 2019年7月30日 下午3:07:15
	 * @author 崔富平
	 */
	private static void generateDslyOaAppIcon() throws IOException{
		//都市绿源OAApp部分start
		String rootPath = "D:\\bmrb\\都市绿源OA_App\\";
		String fileName = rootPath + "icon.png";
		generateIcons(rootPath, fileName);

//						String fileName = "D:\\bmrb\\国道通OA_App\\启动图片\\ios\\20481496.png";
//						String targetFloat = "D:\\bmrb\\国道通OA_App\\splash\\";
//						ImageToIcon.cutIcons(fileName, targetFloat);
		//都市绿源OAApp部分 end
	}
	/**
	 * 二部OAApp
	 * @throws IOException
	 * @datetime 2019年7月30日 下午3:07:30
	 * @author 崔富平
	 */
	private static void generateErbuOaAppIcon() throws IOException{
		//二部OAApp部分start
		String rootPath = "D:\\bmrb\\二部OA_App\\";
		String fileName = rootPath + "icon.png";
		generateIcons(rootPath, fileName);

//				String fileName = "D:\\bmrb\\国道通OA_App\\启动图片\\ios\\20481496.png";
//				String targetFloat = "D:\\bmrb\\国道通OA_App\\splash\\";
//				ImageToIcon.cutIcons(fileName, targetFloat);
		//二部OAApp部分 end
	}
	/**
	 * hdApp
	 * @throws IOException
	 * @datetime 2019年7月29日 下午5:09:44
	 * @author 崔富平
	 */
	private static void generateHdAppIcon() throws IOException {
		//hdApp部分start
		String rootPath = "D:\\bmrb\\安全隐患排查App\\icon\\";
		String fileName = rootPath + "icon.png";
		generateIcons(rootPath, fileName);
//		String fileName = "D:\\bmrb\\国道通OA_App\\启动图片\\ios\\20481496.png";
//		String targetFloat = "D:\\bmrb\\国道通OA_App\\splash\\";
//		ImageToIcon.cutIcons(fileName, targetFloat);
		//hdApp部分 end
	}
	//剪切所有图标
	public static void cutIcons(String fileName, String targetFloat) throws IOException {
		System.out.println("开始生成欢迎屏幕图片....");
		//源图片大小：2048X1496 2436X1125
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-568h@2x.png", 640, 1136);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-667h@2x.png", 750, 1334);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-568h@2x.png", 1136, 640);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-667h@2x.png", 1334, 750);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape@2x~ipad.png", 2048, 1496);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape~ipad.png", 1024, 748);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape7~ipad.png", 1024, 768);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait~ipad.png", 768, 1004);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait7~ipad.png", 768, 1024);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default.png", 320, 480);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default@2x.png", 640, 960);
		ImageToIcon.cutIcon(fileName, targetFloat, "2688-1242.png", 2688, 1242);
		ImageToIcon.cutIcon(fileName, targetFloat, "1792-828.png", 1792, 828);
		ImageToIcon.cutIcon(fileName, targetFloat, "1334-750.png", 1334, 750);
		ImageToIcon.cutIcon(fileName, targetFloat, "1336-640.png", 1336, 760);
		ImageToIcon.cutIcon(fileName, targetFloat, "2732-2048.png", 2732, 2048);
		ImageToIcon.cutIcon(fileName, targetFloat, "2388-1668.png", 2388, 1668);
		ImageToIcon.cutIcon(fileName, targetFloat, "2224-1668.png", 2224, 1668);
		ImageToIcon.cutIcon(fileName, targetFloat, "1242-2688.png", 1242, 2688);
		ImageToIcon.cutIcon(fileName, targetFloat, "828-1792.png", 828, 1792);
		ImageToIcon.cutIcon(fileName, targetFloat, "2048-2732.png", 2048, 2732);
		ImageToIcon.cutIcon(fileName, targetFloat, "1668-2388.png", 1668, 2388);
		ImageToIcon.cutIcon(fileName, targetFloat, "1668-2224.png", 1668, 2224);
		System.out.println("生成欢迎屏幕图片结束....");
	}
	//剪切高度大于宽度的图片
	public static void cutIconsHeight(String fileName, String targetFloat) throws IOException {
		
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-736h@3x.png", 1242, 2208);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-812h@3x.png", 1125, 2436);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-736h@3x.png", 2208, 1242);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape-812h@3x.png", 2436, 1125);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Landscape7@2x~ipad.png", 2048, 1536);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait@2x~ipad.png", 1536, 2008);
		ImageToIcon.cutIcon(fileName, targetFloat, "Default-Portrait7@2x~ipad.png", 1536, 2048);
		
	}
	public static void cutIcon(String fileName, String targetFloat, String targetFileName, int width, int height) throws IOException {
		BufferedImage bufferedImage = ImageIO.read(new File(fileName));
		//图片宽高
		int imageWidth = bufferedImage.getWidth();
		int imageHeight = bufferedImage.getHeight();
		//图片中心坐标
		int centerWidth = imageWidth/2;
		int centerHeight = imageHeight/2;
		//起始点坐标
		int startX = centerWidth - width/2;
		int startY = centerHeight - height/2;
		BufferedImage subimage = bufferedImage.getSubimage(startX, startY, width, height);
		
		
		//BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		//Graphics2D createGraphics = bi.createGraphics();
		//createGraphics.drawImage(scaledInstance, 0, 0, width, height, null);
		ImageIO.write(subimage, "png", new File(targetFloat + targetFileName));
	}
	//缩放所有图标
	public static void scaleIcons(String fileName, String targetFloat) throws IOException {

		isChartPathExist(targetFloat);
		System.out.println("开始生成图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "icon29.png", 29);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon40.png", 40);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon50.png", 50);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon57.png", 57);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon58.png", 58);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon60.png", 60);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon72.png", 72);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon76.png", 76);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon80.png", 80);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon87.png", 87);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon100.png", 100);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon114.png", 114);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon144.png", 144);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon152.png", 152);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon180.png", 180);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon1024.png", 1024);
		System.out.println("生成图标完成...");
	}
	public static void scaleIconsForAppImageset(String fileName, String targetFloat) throws IOException {
		isChartPathExist(targetFloat);
		System.out.println("开始生成AppImageset图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon180.png", 180);
		System.out.println("生成AppImageset图标完成...");
	}
	public static void scaleIconsForAppDcLogo(String fileName, String targetFloat) throws IOException {
		isChartPathExist(targetFloat);
		System.out.println("开始生成AppDcLogo图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "dclogo@2x.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "dclogo@3x.png", 180);
		System.out.println("生成AppDcLogo图标完成...");
	}
	public static void scaleIconsForAppiconset(String fileName, String targetFloat) throws IOException {
		isChartPathExist(targetFloat);
		System.out.println("开始生成Appiconset图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "29x29.png", 29);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon20.png", 20);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon40.png", 40);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon58.png", 58);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon60.png", 60);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon76.png", 76);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon80.png", 80);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon87.png", 87);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120-1.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon120.png", 120);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon152.png", 152);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon167.png", 167);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon180.png", 180);
		ImageToIcon.generateIcon(fileName, targetFloat, "icon1024.png", 1024);
		System.out.println("生成Appiconset图标完成...");
	}
	public static void scaleIconsForAppStore(String fileName, String targetFloat) throws IOException {
		isChartPathExist(targetFloat);
		System.out.println("开始生成AppStore图标...");
		ImageToIcon.generateIcon(fileName, targetFloat, "57.png", 57);
		ImageToIcon.generateIcon(fileName, targetFloat, "512.png", 512);
		ImageToIcon.generateIcon(fileName, targetFloat, "logo.png", 571);
		System.out.println("生成AppStore图标完成...");
	}
	
	//缩放单个图标
	public static void generateIcon(String fileName, String targetFloat, String targetFileName, int width) throws IOException {
		isChartPathExist(targetFloat);
		
		BufferedImage bufferedImage = ImageIO.read(new File(fileName));
		int height = width;
		Image scaledInstance = bufferedImage.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D createGraphics = bi.createGraphics();
		createGraphics.drawImage(scaledInstance, 0, 0, width, height, null);
		ImageIO.write(bi, "png", new File(targetFloat + targetFileName));
	}
	/**
	 * 创建文件夹
	 * @param dirPath
	 * @datetime 2019年7月29日 下午5:07:45
	 * @author 崔富平
	 */
	public static void isChartPathExist(String dirPath) {
		File file = new File(dirPath);
		if(!file.exists()) {
			file.mkdirs();
		}
	}
	private static void generateIcons(String rootPath, String fileName) throws IOException {
		String targetFloat = rootPath + "icon\\";
		ImageToIcon.scaleIcons(fileName, targetFloat);
		String targetFloatIconSet = rootPath + "icon\\iconset\\";
		ImageToIcon.scaleIconsForAppiconset(fileName, targetFloatIconSet);
		String targetFloatImageSet = rootPath + "icon\\imageset\\";
		ImageToIcon.scaleIconsForAppImageset(fileName, targetFloatImageSet);
		String targetFloatAppStore = rootPath + "icon\\appstoreicon\\";
		ImageToIcon.scaleIconsForAppStore(fileName, targetFloatAppStore);
		String targetFloatDcLogoSet = rootPath + "icon\\dcLogo\\";
		ImageToIcon.scaleIconsForAppDcLogo(fileName, targetFloatDcLogoSet);
	}

}
