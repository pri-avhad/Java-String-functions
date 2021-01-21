class string_fns
{
    static void main()
    {
        String st = "StringValue1";
        String st1 = " StringValue2";
        System.out.println("String st = StringValue1;");
        int a = st.length();
        System.out.println("int a = st.length(); "+a);
        char b = st.charAt(3);
        System.out.println("char b = st.CharAt(3); "+b);
        int c = st.indexOf('a');
        System.out.println("int c = st.indexOf('a'); "+c);
        int d = st.lastIndexOf('a');
        System.out.println("int d = st.LastindexOf('a'); "+d);
        String e = st.substring(1);
        System.out.println("String e = st.substring(1); "+e);
        String f = st.toLowerCase();
        System.out.println("String f = st.toLowerCase(); "+f);
        String g = st.toUpperCase();
        System.out.println("String g = st.toUpperCase(); "+g);
        String h = st.replace('a','5');
        System.out.println("String h = st.replace('a','5'); "+h);
        String i = st.concat(st1);
        System.out.println("String i = st.concat(st1); "+ i);
    }
}
