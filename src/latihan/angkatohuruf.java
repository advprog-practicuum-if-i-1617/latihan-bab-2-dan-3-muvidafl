package konversiAngka;

public class angkatohuruf {
    String[] huruf = {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    
    int input;
    public angkatohuruf(int input) {
        this.input = input;
    }
    public String convert(int a) {
        String finish=null;
        input = a;
        if (input<12) {
            finish = huruf[input];
        } else if (input>=12 && input<=19) {
            finish = huruf[input%10] + " belas";
        } else if (input>=20 && input<=99) {
            finish = huruf[input/10] + " puluh " + huruf[input%10];
        }
        return finish;
    }
    public String convert() {
        String finish =null;
        if (input>=100 && input <=199) {
            finish = "seratus " + convert(input%100);
        } else if (input>=200 && input<=999) {
            finish = huruf[input/100] + " ratus " + convert(input%100);
        }
        return finish;
    }
    public void display() {
        if (input<100) {
            System.out.println(convert(input));
        } else if (input>=100) {
            System.out.println(convert());
        }
    }

}
