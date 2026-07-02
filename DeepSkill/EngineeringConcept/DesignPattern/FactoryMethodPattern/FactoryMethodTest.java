package FactoryMethodPattern;

public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory=new WordDocFactory();
        wordFactory.openDocument();

        DocumentFactory pdfFactory=new PdfDocFactory();
        pdfFactory.openDocument();

        DocumentFactory excelFactory=new ExcelDocFactory();
        excelFactory.openDocument();
    }
}
