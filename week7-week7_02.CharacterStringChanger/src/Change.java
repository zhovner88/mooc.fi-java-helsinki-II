public class Change {

    char fromCharacter;
    char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        char[] characters = characterString.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == fromCharacter) {
                characters[i] = toCharacter;
            }
        }

        return new String(characters);
    }

}