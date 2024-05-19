package task_1.languages_2;

public class Main {
    public static void main(String[] args) {
        var lowLevel = Procedural.LowLevel.ASSEMBLER;
        var highLevel = Procedural.HighLevel.FORTRAN;
        System.out.println(lowLevel);
        System.out.println(highLevel);
        var str = Procedural.LowLevel.valueOf("ASSEMBLER");
        System.out.println(str);

        var oop = NonProcedural.ObjectOriented.JAVA;
        var declarative1 = NonProcedural.Declarative.FUNCTIONAL.getName();
        var declarative2= NonProcedural.Declarative.LOGICAL.getName();
        System.out.println(oop);
        System.out.println(declarative1);
        System.out.println(declarative2);



    }
}