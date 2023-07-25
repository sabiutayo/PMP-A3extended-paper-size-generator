public class CustomPaperSize {

    private static int id = 0;
    private PaperSizeDescription paperSizeDescription;
    private PaperSize paperSize;
    private double width;
    private double height;
    private double top_border;
    private double bottom_broder;
    private double left_broder;
    private double right_broder;


    public CustomPaperSize(double width,
                           double height,
                           double topBorder,
                           double bottomBroder,
                           double leftBroder,
                           double rightBroder) {
        this.width = width;
        this.height = height;
        top_border = topBorder;
        bottom_broder = bottomBroder;
        left_broder = leftBroder;
        right_broder = rightBroder;
        this.paperSizeDescription = new PaperSizeDescription(this);
        this.paperSize = new PaperSize(this);
        id++;


    }

    public int getId() {
        return id;
    }

    public PaperSize getPaperSize() {
        return paperSize;
    }

    public CustomPaperSize setPaperSize(PaperSize paperSize) {
        this.paperSize = paperSize;
        return this;
    }

    public double getWidth() {
        return width;
    }

    public CustomPaperSize setWidth(double width) {
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public CustomPaperSize setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getTop_border() {
        return top_border;
    }

    public CustomPaperSize setTop_border(double top_border) {
        this.top_border = top_border;
        return this;
    }

    public double getBottom_broder() {
        return bottom_broder;
    }

    public CustomPaperSize setBottom_broder(double bottom_broder) {
        this.bottom_broder = bottom_broder;
        return this;
    }

    public double getLeft_broder() {
        return left_broder;
    }

    public CustomPaperSize setLeft_broder(double left_broder) {
        this.left_broder = left_broder;
        return this;
    }

    public double getRight_broder() {
        return right_broder;
    }

    public CustomPaperSize setRight_broder(double right_broder) {
        this.right_broder = right_broder;
        return this;
    }

    public PaperSizeDescription getPaperSizeDescription() {
        return paperSizeDescription;
    }

    @Override
    public String toString() {
        return "CustomPaperSize{" +
                "width=" + width +
                ", height=" + height +
                ", top_border=" + top_border +
                ", bottom_broder=" + bottom_broder +
                ", left_broder=" + left_broder +
                ", right_broder=" + right_broder +
                '}';
    }
}
