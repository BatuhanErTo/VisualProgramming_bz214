public class StringTest {
    public static void main(String[] args) {

        String s1 = "Erciyes";
        String s2 = "Uni";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        String s4 = "Erciyes:Universitesi-Muhendislik:Fakultesi";
        String[] parts1 = s4.split("-");
        for (String part : parts1){
            System.out.println(part);
        }

        String[] parts2 = s4.split("[:-]");//ayraç işareti veya olarak işe yarıyor
        for (String part : parts2){
            System.out.println(part);
        }

        System.out.println(s4.replace('e','b'));
        System.out.println(s4.replaceAll("i","ab"));
        System.out.println(s4.replaceFirst("es","bz214"));
        System.out.println(s4.replaceAll("[:-]","****"));

        String s5 = "ab";
        String s6 = "ae";
        System.out.println(s5.compareTo(s6));
        String s7 = "ac";
        System.out.println(s5.compareTo(s7));
        //farklılık neredeyse ilk oraya göre değer döndürür

        String s = "Ercites Universitesi";
        System.out.println(s.substring(10,12));
        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf('e',10));
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.lastIndexOf('e',15));
        System.out.println(s.indexOf("es"));

        int i = 10;
        String x = String.valueOf(i);
        System.out.println(x);
        String y = Integer.toString(i);
        System.out.println(y);

        String z = "10";
        int zToInt = Integer.parseInt(z);
        System.out.println(zToInt);
        double b = Double.parseDouble(z);
        System.out.println(b);
        boolean c = Boolean.parseBoolean("fal");//true değilse ne yazarsan yaz false döndürür
        System.out.println(c);
    }
}
