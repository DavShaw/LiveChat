package org.davshaw.livechat.security;

import org.jasypt.util.text.BasicTextEncryptor;

@SuppressWarnings("unused")
public class Encrypter {
    
    private static final String WEAK_PASSWORD = "m4bVAyQ7gFhPX48r"; // 16 characters
    private static final String NORMAL_PASSWORD = "yJwHfPojoPr0Fz4DFgE5GfCdK6e7sjbfvHVhDuvJ"; // 40 characters
    private static final String STRONG_PASSWORD = "CWX4x7Fh0oLwLpHyXnqbv2mzdK9HU0JHgKxdZToWfHfV1T5iUp3EBXcucJu6NFUWPuK3dDawJjc3xfmcg3icoALEjubjyXP0TstA"; // 100 characters
    private int strength = 3;
    BasicTextEncryptor textEncryptor;

    public Encrypter(int strength) {
        this.textEncryptor = new BasicTextEncryptor();
        if (strength <= 1) {
            this.textEncryptor.setPassword(WEAK_PASSWORD);
        } else if (strength >= 3) {
            this.textEncryptor.setPassword(STRONG_PASSWORD);
        } else {
            this.textEncryptor.setPassword(NORMAL_PASSWORD);
        }
    }

    public String encrypt(String password) {
        return this.textEncryptor.encrypt(password);
    }

    public String decrypt(String password) {
        return this.textEncryptor.decrypt(password);
    }
}
