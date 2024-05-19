package task_1.languages_1;

import task_1.languages_2.NonProcedural;

public class Main {
    public static void main(String[] args) {
        LowLevelLanguage ll = new LowLevelLanguage("Assembler");

        HighLevelLanguage hl1 = new HighLevelLanguage("Fortran");
        HighLevelLanguage hl2 = new HighLevelLanguage("Basic");
        HighLevelLanguage hl3 = new HighLevelLanguage("Pascal");
        HighLevelLanguage hl4 = new HighLevelLanguage("C");

        ObjectOrientedLanguage ool1 = new ObjectOrientedLanguage("C++");
        ObjectOrientedLanguage ool2 = new ObjectOrientedLanguage("Visual");
        ObjectOrientedLanguage ool3 = new ObjectOrientedLanguage("Basic");
        ObjectOrientedLanguage ool4 = new ObjectOrientedLanguage("Delphi");
        ObjectOrientedLanguage ool5 = new ObjectOrientedLanguage("Java");

        LogicalLanguage logLang = new LogicalLanguage("Prolog");

        FunctionalLanguage funcLang = new FunctionalLanguage("Lisp");
    }
}
