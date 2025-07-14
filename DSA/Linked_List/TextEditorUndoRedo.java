class TextState {
    String content;
    TextState prev, next;

    public TextState(String content) {
        this.content = content;
    }
}

class TextEditor {
    TextState current;
    int size = 0;
    final int LIMIT = 10;

    void addState(String content) {
        TextState newState = new TextState(content);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
        size++;
        if (size > LIMIT) {
            while (current.prev.prev != null) current = current.prev;
            current.prev = null;
            size = LIMIT;
        }
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.content);
        } else {
            System.out.println("No Undo");
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.content);
        } else {
            System.out.println("No Redo");
        }
    }

    void showCurrent() {
        if (current != null) {
            System.out.println("Current: " + current.content);
        }
    }
}

public class TextEditorUndoRedo {
    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addState("Hello");
        te.addState("Hello World");
        te.addState("Hello World!");
        te.showCurrent();
        te.undo();
        te.undo();
        te.redo();
        te.showCurrent();
    }
}
