import java.util.StringJoiner;

public enum Type {
    ACOUSTIC,ELECTRIC;

    public String toString() {
        switch(this){
            case ACOUSTIC: return "ACOUSTIC";
            case ELECTRIC: return "ELECTRIC";
        }
        return null;
    }
}
