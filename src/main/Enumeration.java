package main;




public enum Enumeration {

    //Objects
    ENUM_OBJECT_1 (123,"Texto1"),
    ENUM_OBJECT_2 (123,"Texto2"),
    ENUM_OBJECT_3(1243,"Texto3");

    //Properties
   private final int value1;
   private final String value2;

   //Constructor


    Enumeration(int value1){
        this.value1 = value1;
        value2 = "texto";
    }


    Enumeration(int value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    //Behaviors

    public int getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}
