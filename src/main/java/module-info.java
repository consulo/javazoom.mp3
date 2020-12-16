/**
 * @author VISTALL
 * @since 16/12/2020
 */
module javazoom.mp3 {
	requires transitive java.desktop;

	requires javazoom.jlayer;

	provides javax.sound.sampled.spi.AudioFileReader with javazoom.spi.mpeg.sampled.file.MpegAudioFileReader;

	provides javax.sound.sampled.spi.AudioFileWriter with javazoom.spi.mpeg.sampled.file.MpegAudioFileWriter;
	
	provides javax.sound.sampled.spi.FormatConversionProvider with javazoom.spi.mpeg.sampled.convert.MpegFormatConversionProvider;
}