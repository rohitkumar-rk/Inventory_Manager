package android.example.android.inventory;

public class Items {

    private static final int NO_IMAGE_PROVIDED =-1 ;
    private String mProductName;
    private int mPrice;
    private int mQuantity;
    private String mSupplierName;
    private String mSupplierPhone;
    private String mSupplierEmail;
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    public Items(String productName, int price, int quantity, String supplierName,
                 String supplierPhone, String supplierEmail,int imageResourceId){
        mProductName=productName;
        mPrice=price;
        mSupplierName=supplierName;
        mSupplierPhone=supplierPhone;
        mSupplierEmail=supplierEmail;
        mImageResourceId=imageResourceId;
    }

    public String getProductName(){
        return mProductName;
    }

    public int getPrice(){
        return mPrice;
    }

    public int getQuantity(){
        return mQuantity;
    }

    public String getSupplierName(){
        return mSupplierName;
    }

    public String getSupplierPhone(){
        return mSupplierPhone;
    }

    public String getSupplierEmail(){
        return mSupplierEmail;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }


}
