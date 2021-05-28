package class01.test;


import java.io.File;

/**
 * @Auther: HuangRui
 * @Date: 2021/5/28 17:49
 * @Description:
 */
public class Code02 {

    public static int getFileNumber(String path){
        int count = 0;
        File file = new File(path);
        if(file.isFile()){
            return 1;
        }
        if(!file.isFile()&&!file.isDirectory()){
            return 0;
        }
        return count;
    }


    public static void main(String[] args) {
        // 你可以自己更改目录
        String path = "E:\\IdeaProjects";
        System.out.println(getFileNumber(path));
    }
}
