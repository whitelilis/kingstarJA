package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \u0376\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:432</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcInvestorField extends StructObject {
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(0) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(1) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > InvestorGroupID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPartyNameType
	 */
	@Array({81}) 
	@Field(3) 
	public Pointer<Byte > InvestorName() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(4) 
	public byte IdentifiedCardType() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdCardTypeType
	 */
	@Field(4) 
	public CThostFtdcInvestorField IdentifiedCardType(byte IdentifiedCardType) {
		this.io.setByteField(this, 4, IdentifiedCardType);
		return this;
	}
	/**
	 * \u05a4\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIdentifiedCardNoType
	 */
	@Array({51}) 
	@Field(5) 
	public Pointer<Byte > IdentifiedCardNo() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public int IsActive() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\u053e<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(6) 
	public CThostFtdcInvestorField IsActive(int IsActive) {
		this.io.setIntField(this, 6, IsActive);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03f5\ufffd\u7ef0<br>
	 * C type : TThostFtdcTelephoneType
	 */
	@Array({41}) 
	@Field(7) 
	public Pointer<Byte > Telephone() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \u0368\u0476\ufffd\ufffd\u05b7<br>
	 * C type : TThostFtdcAddressType
	 */
	@Array({101}) 
	@Field(8) 
	public Pointer<Byte > Address() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(9) 
	public Pointer<Byte > OpenDate() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * \ufffd\u05bb\ufffd<br>
	 * C type : TThostFtdcMobileType
	 */
	@Array({41}) 
	@Field(10) 
	public Pointer<Byte > Mobile() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0123\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(11) 
	public Pointer<Byte > CommModelID() {
		return this.io.getPointerField(this, 11);
	}
	public CThostFtdcInvestorField() {
		super();
	}
	public CThostFtdcInvestorField(Pointer pointer) {
		super(pointer);
	}
}
