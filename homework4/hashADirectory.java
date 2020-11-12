import java.io.*;
import java.security.MessageDigest;

public class hashADirectory {
//hash部分
    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        //用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        //使用SHA1哈希/摘要算法
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead;
        do {

            numRead = is.read(buffer);

            if (numRead > 0) {
                
                complete.update(buffer, 0, numRead);
            }
            
            
        } while (numRead != -1);

        
        is.close();

        
        return complete.digest();
    }
//打开文件夹，并判别当前对象为文件/子文件夹
    public static void dfs(String path) throws Exception {       //path其实就是指向test文件夹
        File dir = new File(path);                               //将path赋给File类的对象——dir
        File[] fs = dir.listFiles();                             //File类的数组用于存放将dir指向的文件夹打开后的各个File类的对象
        for(int i = 0; i < fs.length; i++) {                     //逐一访问
            if(fs[i].isFile()) {
                System.out.print("file   " + fs[i].getName()+"   ");
                //计算文件的哈希值
                FileInputStream is = new FileInputStream(fs[i]);
                byte[] sha1 = SHA1Checksum(is);

                String result = "";
                for(int j=0;j<sha1.length;j++){
                    result +=Integer.toString(sha1[j]&0xFF,16);
                }
                System.out.println(result);
                System.out.print("文件修改后的哈希值为： ");

                //修改文件
                FileWriter iss = new FileWriter( fs[i], true);//专门用于读取并修改文件的方法
                iss.write("!!!");                                 //不覆盖地写入"！！！"
                iss.close();                                          //关闭
                FileInputStream is2 = new FileInputStream(fs[i]);
                byte[] sha2 = SHA1Checksum(is2);                      //再次生成哈希值

                String result2 = "";
                for(int j=0;j<sha2.length;j++){
                    result2 +=Integer.toString(sha2[j]&0xFF,16);
                }
                System.out.println(result2);
                System.out.println("-----------------------------------------------");
                //文件哈希值输出完毕
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName());
            }
        }
    }



//主函数
    public static void main(String[] args) {
        try {
            dfs("/Users/philiphan/Desktop/test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}