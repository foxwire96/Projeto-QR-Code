package com.example.QRCodeReader;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class LeitorQR {
    public static void main(String[] args) throws Exception {
        File arquivo = new File("qrcode.png");
        BufferedImage imagem = ImageIO.read(arquivo);

        LuminanceSource source = new BufferedImageLuminanceSource(imagem);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        Result resultado = new MultiFormatReader().decode(bitmap);
        System.out.println("📥 Conteúdo do QR Code: " + resultado.getText());
    }
}
