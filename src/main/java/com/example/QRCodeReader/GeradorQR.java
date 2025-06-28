package com.example.QRCodeReader;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;

import java.nio.file.Path;

public class GeradorQR {
    public static void main(String[] args) throws Exception {
        String texto = "https://www.google.com";
        int largura = 300;
        int altura = 300;

        BitMatrix matrix = new MultiFormatWriter().encode(texto, BarcodeFormat.QR_CODE, largura, altura);
        Path caminho = Path.of("qrcode.png");
        MatrixToImageWriter.writeToPath(matrix, "PNG", caminho);

        System.out.println("✅ QR Code gerado com sucesso: " + caminho.toAbsolutePath());
    }
}