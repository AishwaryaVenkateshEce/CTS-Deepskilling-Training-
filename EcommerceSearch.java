import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Product{
    private int productId;
    private String productName;
    private String category;
    public Product(int productId,String productName,String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public String getCategory(){
        return category;
    }
    public void display(){
        System.out.println("Product ID:"+productId+",Name:"+productName+",Category:"+category);
    }
}
public class EcommerceSearch{
    public static Product linearSearch(Product[] products,int targetId){
        for(Product p:products){
            if(p.getProductId()==targetId){
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products,int targetId){
        int low=0;
        int high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].getProductId()==targetId){
                return products[mid];
            }
            else if(products[mid].getProductId()<targetId){
                low=mid +1;
            }
            else{
                high=mid-1;
            }
        }
        return null;
    }
    public static void main(String[]args) {
        Product[] products = {
                new Product(103, "Laptop", "Electronics"),
                new Product(101, "Shirt", "Clothing"),
                new Product(105, "Mobile", "Electronics"),
                new Product(102, "Book", "Stationery"),
                new Product(104, "Shoes", "Footwear"),

        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product ID to search:");
        int targetId = sc.nextInt();
        long startTime1 = System.nanoTime();
        Product result1 = linearSearch(products, targetId);
        long endTime1 = System.nanoTime();
        System.out.println("\n Linear Search Result:");
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }
        System.out.println("Time Taken:" + (endTime1 - startTime1) + "ns");
        Arrays.sort(products,Comparator.comparingInt(Product::getProductId));
        long startTime2 = System.nanoTime();
        Product result2 = linearSearch(products, targetId);
        long endTime2 = System.nanoTime();
        System.out.println("\n Binary Search Result:");
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }
        System.out.println("Time Taken:" + (endTime2 - startTime2) + "ns");

        System.out.println("\n Analysis:");
        System.out.println("Linear Search Time Complexity:O(n)");
        System.out.println("Binary Search Time Complexity:O(log n)");
        System.out.println("Binary Search is faster for large,sorted data.");
    }

}
