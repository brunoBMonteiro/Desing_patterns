package estruturais.facade;

public class VideoConversion {
    private Codec destinationCodec;

    public void verificaFormato(String format) {
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
    }
}
