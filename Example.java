//Ευάγγελος Δράικος3150039- Αποστολόπουλος Νικόλαος3130012
public class Example {
     
    private String category;
    private double[] x;
     
    public Example(String category, double[] x){
        this.category = category;
        this.x = x;
    }
     
    public String getCategory(){
        return this.category;
    }
     
    public double[] getAttributes(){
        return this.x;
    }
     
}