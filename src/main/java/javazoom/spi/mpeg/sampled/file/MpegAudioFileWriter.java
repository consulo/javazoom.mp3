package javazoom.spi.mpeg.sampled.file;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.spi.AudioFileWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author VISTALL
 * @since 16/12/2020
 *
 * Dummy impl for correct iteration of file types
 */
public class MpegAudioFileWriter extends AudioFileWriter
{
	@Override
	public AudioFileFormat.Type[] getAudioFileTypes()
	{
		return new AudioFileFormat.Type[]{
				MpegFileFormatType.MP3,
				MpegFileFormatType.MPEG
		};
	}

	@Override
	public AudioFileFormat.Type[] getAudioFileTypes(AudioInputStream audioInputStream)
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public int write(AudioInputStream audioInputStream, AudioFileFormat.Type type, OutputStream outputStream) throws IOException
	{
		throw new UnsupportedOperationException();
	}

	@Override
	public int write(AudioInputStream audioInputStream, AudioFileFormat.Type type, File file) throws IOException
	{
		throw new UnsupportedOperationException();
	}
}
