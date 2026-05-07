public static void main(String[] args) {
    String separator = args[0];
    ArrayList<String> contents = new ArrayList<>();
    while(true) {
        String input = IO.readline();
        if (input == null || input.isEmpty()){
            break;
        }
        contents.add(input.toLowerCase());
    }
    String output = String.join(contents, separator);
    IO.println(output);
}