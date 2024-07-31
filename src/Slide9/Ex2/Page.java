package Slide9.Ex2;

public class Page {
    private String content;
    public Page(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object other) {
        return this.content.equals(((Page)other).getContent());
    }
}
