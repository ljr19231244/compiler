import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /* 读取命令行参数*/
        String inputFilePath = args[0];
        String outputPath = args[1];
        File file = new File(inputFilePath);
        InputStreamReader read = null;
        try {
            read = new InputStreamReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(read);
        String input_temp = null;
        StringBuilder input = new StringBuilder();
        while (true) {
            try {
                if ((input_temp = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            input.append(input_temp + "\n");
        }
        try {
            System.setOut(new PrintStream(new BufferedOutputStream(
                    new FileOutputStream(outputPath)), true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        CharStream inputStream = CharStreams.fromString(file.toString());
        miniSysYLexer lexer = new miniSysYLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        miniSysYParser parser = new miniSysYParser(tokenStream);
        //这里改变调用的函数
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.compUnit();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }
}
