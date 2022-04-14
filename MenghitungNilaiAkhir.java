public class MenghitungNilaiAkhir {
    public static void main(String[] args) {
        //input
        int uts = 75;
        int uas = 80;
        int quiz1 = 95;
        int quiz2 = 88;
        int quiz3 = 90;
        int ukk;
        double NA;
        
        //proses
        ukk = (quiz1+quiz2+quiz3)/3;
        NA = (0.15*uts)+(0.15*uas)+(0.7*ukk);
        
        //output
        System.out.println("Nilai Akhir Anda: "+ String.format("%.2f",NA));
    
    }
}
