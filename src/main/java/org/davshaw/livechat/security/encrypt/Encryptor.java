package org.davshaw.livechat.security.encrypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class Encryptor {

    private final String password = "M1HNk3fG7xGYJ0ZQ9zQ01xZHeNxGYJfNosvG8WKKuJkns7d1bAVsp7njfs";

    BasicTextEncryptor textEncryptor;

    public Encryptor() {
        textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(this.password);
    }

    public String encrypt(String input) {
        return textEncryptor.encrypt(input);
    }

    public String decrypt(String input) {
        return textEncryptor.decrypt(input);
    }
}
