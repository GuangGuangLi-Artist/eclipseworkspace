package cn.itcast.code.day19.FileLearn;
/*
    构造方法：
    		File(String pathname)：根据一个路径得到File对象
    		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
    		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象

    创建功能：
    public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
    public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
    public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来

    骑白马的不一定是王子，可能是班长。
    注意：你到底要创建文件还是文件夹，你最清楚，方法不要调错了。

    删除功能
	    public boolean delete()


    注意：
    		A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
    		B:Java中的删除不走回收站。
    		C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
    重命名功能:public boolean renameTo(File dest)
		如果路径名相同，就是改名。
		如果路径名不同，就是改名并剪切。

        路径以盘符开始：绝对路径	c:\\a.txt
        路径不以盘符开始：相对路径	a.txt
     判断功能:
         public boolean isDirectory():判断是否是目录
         public boolean isFile():判断是否是文件
         public boolean exists():判断是否存在
         public boolean canRead():判断是否可读
         public boolean canWrite():判断是否可写
         public boolean isHidden():判断是否隐藏

     获取功能：
        public String getAbsolutePath()：获取绝对路径
        public String getPath():获取相对路径
        public String getName():获取名称
        public long length():获取长度。字节数
        public long lastModified():获取最后一次的修改时间，毫秒值

    获取功能：
	public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组





 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo {

    public static void main(String[] args) {

        String property = System.getProperty("user.dir");

        File file  = new File(property + "\\src\\cn\\itcast\\code\\day19\\FileLearn\\demo\\demo.txt");

        File file2 = new File(property + "\\src\\cn\\itcast\\code\\day19\\FileLearn","demo2.txt");

        File file3 = new File(property + "\\src\\cn\\itcast\\code\\day19\\FileLearn\\demo\\file3");
        File file4 = new File(file3,"demo3.txt");

        System.out.println(file3.getAbsolutePath());
        System.out.println("mkdir:" + file3.mkdir());

        try {
            System.out.println("createNewFile:" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file5 = new File(property + "\\src\\cn\\itcast\\code\\day19\\FileLearn\\demo\\AA\\BB");
        System.out.println("mkdirs:" + file5.mkdirs());

        //public boolean delete()
        System.out.println("deleteBB:" + file5.delete());

        //删除文件
        System.out.println("deleteFile: " + file.delete());


        //先新建文件
        try {
            System.out.println("createNewFile: " + file2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2New = new File(property +"\\src\\cn\\itcast\\code\\day19\\FileLearn","lingqingxia.txt");

        //重命名文件
        System.out.println("renameTo:" + file2.renameTo(file2New));


        //public boolean isDirectory():判断是否是目录
        System.out.println("isDirectory:" + file2.isDirectory());

        //public boolean isFile():判断是否是文件
        System.out.println("isFile:" + file2.isFile());

        //public boolean exists():判断是否存在
        System.out.println("exists:" + file2.exists());

        //public boolean canRead():判断是否可读
        System.out.println("canRead:" + file2.canRead());

        //public boolean canWrite():判断是否可写
        System.out.println("canWrite:" + file2.canWrite());

        // public boolean isHidden():判断是否隐藏
        System.out.println("isHidden:" + file2.isHidden());


        //public String getAbsolutePath()：获取绝对路径

        String s = file2.getAbsolutePath();
        System.out.println("getAbsolutePath:" + file2.getAbsolutePath());

        //public String getPath():获取相对路径

        System.out.println("getPath: " + file2.getPath());

        //public String getName():获取名称
        System.out.println("getName: " + file2.getName());

        // public long length():获取长度。字节数
        System.out.println("length: " + file2.length());

        // public long lastModified():获取最后一次的修改时间，毫秒值
        System.out.println("lastModified " + file2.lastModified());

        Date d = new Date(file2.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s2 = sdf.format(d);
        System.out.println(s2);

        System.out.println("-----");
        //public String[] list():获取指定目录下的所有文件或者文件夹的名称数组

        File file6 = new File(property + "\\src\\cn\\itcast\\code\\day19\\");
        String [] strArr = file6.list();
        for(String s3: strArr){
            System.out.println(s3);

        }

        System.out.println("----");

        //public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组

        File[] fileArr = file6.listFiles();
        for(File file_for: fileArr){
            System.out.println(file_for.getName());
        }




    }
}
