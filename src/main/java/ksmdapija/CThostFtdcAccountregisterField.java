package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2\ufffd\ufffd<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:5479</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcAccountregisterField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(0) 
	public Pointer<Byte > TradeDay() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0431\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankIDType
	 */
	@Array({4}) 
	@Field(1) 
	public Pointer<Byte > BankID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0437\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankBrchIDType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > BankBranchID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcBankAccountType
	 */
	@Array({41}) 
	@Field(3) 
	public Pointer<Byte > BankAccount() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(4) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\u06bb\ufffd\ufffd\ufffd\u02fe\ufffd\ufffd\u05a7\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFutureBranchIDType
	 */
	@Array({31}) 
	@Field(5) 
	public Pointer<Byte > BrokerBranchID() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(6) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(7) 
	public byte IdCardType() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(7) 
	public CThostFtdcAccountregisterField IdCardType(byte IdCardType) {
		this.io.setByteField(this, 7, IdCardType);
		return this;
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(8) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIndividualNameType
	 */
	@Array({51}) 
	@Field(9) 
	public Pointer<Byte > CustomerName() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\u05b4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(10) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOpenOrDestroyType
	 */
	@Field(11) 
	public byte OpenOrDestroy() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOpenOrDestroyType
	 */
	@Field(11) 
	public CThostFtdcAccountregisterField OpenOrDestroy(byte OpenOrDestroy) {
		this.io.setByteField(this, 11, OpenOrDestroy);
		return this;
	}
	/**
	 * \u01e9\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > RegDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTradeDateType
	 */
	@Array({9}) 
	@Field(13) 
	public Pointer<Byte > OutDate() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(14) 
	public int TID() {
		return this.io.getIntField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffdID<br>
	 * C type : TThostFtdcTIDType
	 */
	@Field(14) 
	public CThostFtdcAccountregisterField TID(int TID) {
		this.io.setIntField(this, 14, TID);
		return this;
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public byte CustType() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCustTypeType
	 */
	@Field(15) 
	public CThostFtdcAccountregisterField CustType(byte CustType) {
		this.io.setByteField(this, 15, CustType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(16) 
	public byte BankAccType() {
		return this.io.getByteField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u02ba\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBankAccTypeType
	 */
	@Field(16) 
	public CThostFtdcAccountregisterField BankAccType(byte BankAccType) {
		this.io.setByteField(this, 16, BankAccType);
		return this;
	}
	public CThostFtdcAccountregisterField() {
		super();
	}
	public CThostFtdcAccountregisterField(Pointer pointer) {
		super(pointer);
	}
}
