package kstradeapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\u05f2\ufffd\ufffd\ufffd<br>
 * <i>native declaration : linuxapi/CTP/KSUserApiStructEx.h:3568</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("kstradeapija") 
public class CThostFtdcBrokerTradingParamsField extends StructObject {
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
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMarginPriceTypeType
	 */
	@Field(2) 
	public byte MarginPriceType() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * \ufffd\ufffd\u05a4\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMarginPriceTypeType
	 */
	@Field(2) 
	public CThostFtdcBrokerTradingParamsField MarginPriceType(byte MarginPriceType) {
		this.io.setByteField(this, 2, MarginPriceType);
		return this;
	}
	/**
	 * \u04ef\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(3) 
	public byte Algorithm() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * \u04ef\ufffd\ufffd\ufffd\u3de8<br>
	 * C type : TThostFtdcAlgorithmType
	 */
	@Field(3) 
	public CThostFtdcBrokerTradingParamsField Algorithm(byte Algorithm) {
		this.io.setByteField(this, 3, Algorithm);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(4) 
	public byte AvailIncludeCloseProfit() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\u01bd\ufffd\ufffd\u04ef\ufffd\ufffd<br>
	 * C type : TThostFtdcIncludeCloseProfitType
	 */
	@Field(4) 
	public CThostFtdcBrokerTradingParamsField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
		this.io.setByteField(this, 4, AvailIncludeCloseProfit);
		return this;
	}
	public CThostFtdcBrokerTradingParamsField() {
		super();
	}
	public CThostFtdcBrokerTradingParamsField(Pointer pointer) {
		super(pointer);
	}
}
