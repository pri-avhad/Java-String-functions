class string_fns2
{
    static void main()
    {
        String st = "StringValue";
        String st1 = "StringValue";
        System.out.println("String st = StringValue;"+" \n"+ "String st1 = StringValue; " );
        boolean a = st.equals(st1);
        System.out.println("boolean a = st.equals(st1); " +a+"\n");
        st = "StringValue";
        st1 = "STRINGVALUE";
        System.out.println("st = StringValue;"+" \n"+ "st1 = STRINGVALUE; " );
        boolean b = st.equalsIgnoreCase(st1);
        System.out.println("boolean b = st.equalsIgnoreCase(st1); " +b+"\n");
        st = "Super ";
        st1 = "Superb";
        System.out.println("st = Super ;"+" \n"+ "st1 = Superb; " );
        int c = "CABLE".compareTo("CADET");
        System.out.println("int c = st.compareTo(st1); " +c+"\n");
        st1 = " StringValue ";
        System.out.println("st1 =  StringValue ; " );
        String d = st1.trim();
        System.out.println("String c = st1.trim(); " +d+"\n");
        st1 = "StringValue";
        System.out.println("st1 =  StringValue; " );
        boolean e = st1.endsWith("ue");
        System.out.println("String d = st1.endswith('ue'); " +e+"\n");
        st1 = " StringValue ";
        System.out.println("st1 =  StringValue ; " );
        boolean f = st1.startsWith("Str");
        System.out.println("boolean f = st1.startswith('Str'); " +f+"\n");
    }
}
