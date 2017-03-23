package konversiAngka;
public class huruftoangka {
    public String[] huruf= {"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public String inputh;
  
    public huruftoangka(String inputh) {
        this.inputh = inputh;
    }
    public int kurang11(String a) {
        int finish=0; inputh=a;
        for (int i = 0; i < 11; i++) {
            if (inputh.contentEquals(huruf[i])) {
                    finish = i;}
        }
        return finish;
    }
    
    public int belas(String a) {
        int finish =0; inputh =a;
        for (int i = 0; i < 10; i++) {
            if (inputh.contentEquals(huruf[i]+" belas")) {
                    finish = 10+i;
            }
        }
        return finish;
    }
    
    public int kurang100(String a) {
        int finish =0; inputh =a;
        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (inputh.contentEquals(huruf[i]+" puluh")) {
                    finish = 10*i;
                } else if (inputh.contentEquals(huruf[i]+" puluh "+huruf[j])) {
                    finish = (10*i)+j;
                }
            }
        }return finish;
    }
    
    public int seratus(String a) {
        int finish =0; inputh =a;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (inputh.contentEquals("seratus "+ huruf[i])) {
                        finish = 100+i;
                } else if (inputh.contentEquals("seratus")) {
                        finish =100;
                } else if (inputh.contentEquals("seratus "+ huruf[i]+ " belas")) {
                        finish = 100+10+i;
                } else if (inputh.contentEquals("seratus "+ huruf[i]+ " puluh "+huruf[j])) {
                        finish = 100+i*10+j;
                }        
            }
        }
        return finish;
    }
    public int ratusan(String a) {
        int finish = 0; inputh=a;
        int i, j, k;
        for (i = 0; i < huruf.length; i++) {
            for (j = 0; j < huruf.length; j++) {
                for (k = 0; k < huruf.length; k++) {
                    if (inputh.contentEquals(huruf[i]+" ratus")) {
                        finish = i*100;
                    } else if (inputh.contentEquals(huruf[i]+ " ratus " + huruf[k])) {
                        finish = i*100 + k;
                    } else if (inputh.contentEquals(huruf[i]+ " ratus " + huruf[j]+ " puluh "+ huruf[k])) {
                        finish = i*100+j*10+k;
                    }                           
            }}             
        }return finish;
    }
    public void display() {
        if (inputh.length()<=8) {
            System.out.println(kurang11(inputh));
        }
        if (inputh.length()>=9 && inputh.length()<=14) {
            System.out.println(belas(inputh));
        } 
        if (inputh.length()>=9 && inputh.length()<=23) {
            System.out.println(kurang100(inputh));
        } 
        if (inputh.length()>=7 && inputh.length()<=31) { //9
            System.out.println(seratus(inputh));
        }
        if (inputh.length()>=9 && inputh.length()<=39) {
            System.out.println(ratusan(inputh));
        }
    }
    
    
}