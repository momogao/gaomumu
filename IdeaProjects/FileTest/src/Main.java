import java.io.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public static void readFile(){
        String[] pathname=new String[]{"路径一","路径二"};
        String output = "输出路径";

        try {
            File writerName=new File(output);
            FileWriter writer= new FileWriter(writerName);
            BufferedWriter out=new BufferedWriter(writer);

            for (int i=0;i<pathname.length;i++) {
                FileReader reader= new FileReader(pathname[i]);
                BufferedReader br=new BufferedReader(reader);
                String line=null;
                while((line=br.readLine())!=null){
                    /*你的代码*/
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
