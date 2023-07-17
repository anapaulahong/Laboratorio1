public class ItemDataJ{
    Object originalValue;

    public ItemDataJ(Object originalValue){
            this.originalValue = originalValue;
        }

    public String getType(){
        if(originalValue.getClass().equals(String.class)) {
            return "cadena";
        } else if (originalValue.getClass().equals(Integer.class)) {
            return "entero";
        } else if (originalValue.getClass().equals(Boolean.class)) {
            return "booleano";
        } else {
            return null; 
        }
        
    }

    public String getInfo() {
        if (originalValue.getClass().equals(String.class)) {
            String stringValue = (String) originalValue;
            return "L" + stringValue.length();
        } else if (originalValue.getClass().equals(Integer.class)) {
            int intValue = (Integer) originalValue;
            if (intValue % 10 == 0) {
                return "M10";
            } else if (intValue % 5 == 0) {
                return "M5";
            } else if (intValue % 2 == 0) {
                return "M2";
            } else {
                return null;
            }
        } else if(originalValue.getClass().equals(Boolean.class)){
            boolean boolValue = (Boolean) originalValue;
            return boolValue ? "Verdadero" : "Falso";
        } else {
            return null;
        }
        }

    public static void main(String[] args){
        ItemDataJ stringData = new ItemDataJ("holi");
        ItemDataJ integerData = new ItemDataJ(7);
        ItemDataJ booleanData = new ItemDataJ(true);
        }
}