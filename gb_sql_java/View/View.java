package View;

import java.io.IOException;

public interface View {
    void start() throws IOException, ClassNotFoundException;
    void printAnswer(String answer);
}
