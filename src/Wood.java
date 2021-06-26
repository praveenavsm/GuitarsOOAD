public enum Wood {
    INDIAN_ROSEWOOD,BRAZILIAN_ROSEWOOD,MAHOGANY,MAPLE,CEDAR,ADIRONDACK,ALDER,SITKA;
    public String toString() {
        switch(this){
            case INDIAN_ROSEWOOD: return "INDIAN_ROSEWOOD";
            case BRAZILIAN_ROSEWOOD: return "BRAZILIAN_ROSEWOOD";
            case MAHOGANY: return "MAHOGANY";
            case MAPLE: return "MAPLE";
            case CEDAR: return "CEDAR";
            case ADIRONDACK: return "ADIRONDACK";
            case ALDER: return "ALDER";
            case SITKA: return "SITKA";
        }
        return null;
    }
}
