import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeEvent;
import javax.print.event.PrintServiceAttributeListener;

public class Main {
    public static void main(String[] args) {

        Customer[]customers={
                new Customer("Сара",35,112,111321),
                new Customer("Иван",30,114,111322),
                new Customer("Том",19,115,111323),

        };
        Gamer[] gamers={
                new Gamer("Джо",24,116,"PS"),
                new Gamer("Джон",14,113,"PC"),
        };
        PrintServiceForInvestor printServiceForInvestor=new PrintServiceForInvestor();
        PrintServiceForEmployee printServiceForEmployee=new PrintServiceForEmployee();

        printServiceForInvestor.print(customers);
        printServiceForInvestor.print(gamers);
        printServiceForEmployee.print(customers);
        printServiceForEmployee.print(gamers);


        Person[]people=new Person[customers.length+ gamers.length];
        for (int i = 0; i < customers.length; i++) {
            people[i]=customers[i];
        }
        for (int i = 0; i < gamers.length; i++) {
            people[i+ customers.length]=gamers[i];
        }
        printServiceForInvestor.print(people);
        printServiceForEmployee.print(people);
    }
}
