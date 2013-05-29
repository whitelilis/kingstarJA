package kstradeapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\u03e2\ufffd\u05b7\ufffd<br>
 * <i>native declaration : linuxapi/CTP/KSUserApiStructEx.h:7</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("kstradeapija") 
public class CThostFtdcDisseminationField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSequenceSeriesType
	 */
	@Field(0) 
	public short SequenceSeries() {
		return this.io.getShortField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u03f5\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSequenceSeriesType
	 */
	@Field(0) 
	public CThostFtdcDisseminationField SequenceSeries(short SequenceSeries) {
		this.io.setShortField(this, 0, SequenceSeries);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(1) 
	public int SequenceNo() {
		return this.io.getIntField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(1) 
	public CThostFtdcDisseminationField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 1, SequenceNo);
		return this;
	}
	public CThostFtdcDisseminationField() {
		super();
	}
	public CThostFtdcDisseminationField(Pointer pointer) {
		super(pointer);
	}
}
