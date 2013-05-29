package kstradeapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u00fb\ufffd\ufffd\ufffd\u032c\ufffd\ufffd\ufffd\u01b2\ufffd\ufffd\ufffd<br>
 * <i>native declaration : linuxapi/CTP/KSUserApiStructEx.h:3701</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("kstradeapija") 
public class CThostFtdcBrokerUserOTPParamField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\u00fb\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(1) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\ufffd\ufffd\ufffd\u1e69\ufffd\ufffd<br>
	 * C type : TThostFtdcOTPVendorsIDType
	 */
	@Array({2}) 
	@Field(2) 
	public Pointer<Byte > OTPVendorsID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u043a\ufffd<br>
	 * C type : TThostFtdcSerialNumberType
	 */
	@Array({17}) 
	@Field(3) 
	public Pointer<Byte > SerialNumber() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u053f<br>
	 * C type : TThostFtdcAuthKeyType
	 */
	@Array({41}) 
	@Field(4) 
	public Pointer<Byte > AuthKey() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \u01af\ufffd\ufffd\u05b5<br>
	 * C type : TThostFtdcLastDriftType
	 */
	@Field(5) 
	public int LastDrift() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \u01af\ufffd\ufffd\u05b5<br>
	 * C type : TThostFtdcLastDriftType
	 */
	@Field(5) 
	public CThostFtdcBrokerUserOTPParamField LastDrift(int LastDrift) {
		this.io.setIntField(this, 5, LastDrift);
		return this;
	}
	/**
	 * \ufffd\u0279\ufffd\u05b5<br>
	 * C type : TThostFtdcLastSuccessType
	 */
	@Field(6) 
	public int LastSuccess() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * \ufffd\u0279\ufffd\u05b5<br>
	 * C type : TThostFtdcLastSuccessType
	 */
	@Field(6) 
	public CThostFtdcBrokerUserOTPParamField LastSuccess(int LastSuccess) {
		this.io.setIntField(this, 6, LastSuccess);
		return this;
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOTPTypeType
	 */
	@Field(7) 
	public byte OTPType() {
		return this.io.getByteField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u032c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOTPTypeType
	 */
	@Field(7) 
	public CThostFtdcBrokerUserOTPParamField OTPType(byte OTPType) {
		this.io.setByteField(this, 7, OTPType);
		return this;
	}
	public CThostFtdcBrokerUserOTPParamField() {
		super();
	}
	public CThostFtdcBrokerUserOTPParamField(Pointer pointer) {
		super(pointer);
	}
}
