package devarthur.post.post.model;

public class Product {

    private String imgText;
    private String imgURL;

    public Product() {
    }

    public Product(String imgText, String imgURL) {
        this.imgText = imgText;
        this.imgURL = imgURL;
    }

    public String getImgText() {
        return imgText;
    }

    public void setImgText(String imgText) {
        this.imgText = imgText;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
