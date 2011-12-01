package caos.steganography;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

public class Steganography {
	private byte clearBit = (byte)0xFE;
	private static final int MESSAGE_START_BYTE = 120; 
	private byte[] byteArray;


	public static void main(String[] args) throws IOException, URISyntaxException {
		Steganography s = new Steganography();

		File inFile = new File("resource/in.bmp");
		File outFile = new File("resource/out.bmp");
		
		//Encode
		s.createByteArrayFromFile(inFile);
		s.encodeMessage("Hej med dig jeg hedder kaj");
		s.writeByteArrayToFile(outFile);
		//////////////////////////////////////////////
		
		//Decode
		s.createByteArrayFromFile(outFile);
		System.out.println(s.decodeMessage());
		//////////////////////////////////////////////
	}


	public Steganography() {

	}

	public void encodeMessage(String message){
		zeroLastBit();

		int bytePosition = MESSAGE_START_BYTE;	
		for(int character = 0; character < message.length(); character++){
			int asciicode = message.charAt(character);
			StringBuilder binaryAsciiCode = new StringBuilder(Integer.toBinaryString(asciicode));
			while (binaryAsciiCode.length() < 8) binaryAsciiCode.insert(0, "0");//prepend zeros if necessary

			for (int bitpos = 0; bitpos < 8; bitpos++){
				int bit = Character.getNumericValue(binaryAsciiCode.charAt(bitpos));
				addBitToByte(bytePosition++, bit);
			}
		}
	}

	public String decodeMessage(){

		int bytePosition = MESSAGE_START_BYTE;
		StringBuilder message = new StringBuilder();
		StringBuilder binaryAsciiCode = new StringBuilder();

		for(bytePosition = MESSAGE_START_BYTE; bytePosition < byteArray.length;){

			for(int bytes = 0; bytes < 8; bytes++){
				binaryAsciiCode.append(getLastBitFromByteN(bytePosition++));
			}

			String aChar = new Character((char)(Integer.parseInt(binaryAsciiCode.toString(), 2))).toString();
			message.append(aChar);
			binaryAsciiCode = new StringBuilder(); // clear binaryAsciiCode
		}
		return message.toString();
	}

	private void createByteArrayFromFile(File inFile) throws IOException {
		InputStream is = new FileInputStream(inFile);

		// Get the size of the file
		long length = inFile.length();

		if (length > Integer.MAX_VALUE) {
			// File is too large
		}

		byte[] bytes = new byte[(int)length];
		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
			offset += numRead;
		}

		// Ensure all the bytes have been read 
		if (offset < bytes.length) {
			throw new IOException("Could not completely read file "+inFile.getName());
		}

		is.close();
		byteArray = bytes;
	}

	public void writeByteArrayToFile(File outFile) throws IOException{
		FileOutputStream fos = new FileOutputStream(outFile);
		fos.write(byteArray);
		fos.close();
	}

	private byte getByteAt(int index){
		return byteArray[index];
	}

	private void setByteAt(int b, int index){
		byteArray[index] = (byte)b;

	}

	private void zeroLastBit(){
		for (int byteLocation = MESSAGE_START_BYTE;byteLocation < byteArray.length;byteLocation++){
			setByteAt(getByteAt(byteLocation) & clearBit, byteLocation);
		}
	}

	private void addBitToByte(int bytePosistion, int bit){
		setByteAt(getByteAt(bytePosistion) + bit, bytePosistion);
	}

	private int getLastBitFromByteN(int n){
		return (getByteAt(n) & 0x0001);
	}

}





