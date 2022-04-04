package estruturais.decorator;



public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Nome,Salario\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Entrada ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Codificada --------------");
        System.out.println(plain.readData());
        System.out.println("- Decodificado --------------");
        System.out.println(encoded.readData());
    }
}
