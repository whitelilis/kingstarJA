package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u036c\ufffd\ufffd\ufffd\u0435\u013a\ufffd\u053c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:1962</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcSyncingInstrumentCommissionRateField extends StructObject {
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CThostFtdcSyncingInstrumentCommissionRateField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public double OpenRatioByMoney() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(4) 
	public CThostFtdcSyncingInstrumentCommissionRateField OpenRatioByMoney(double OpenRatioByMoney) {
		this.io.setDoubleField(this, 4, OpenRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public double OpenRatioByVolume() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public CThostFtdcSyncingInstrumentCommissionRateField OpenRatioByVolume(double OpenRatioByVolume) {
		this.io.setDoubleField(this, 5, OpenRatioByVolume);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public double CloseRatioByMoney() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(6) 
	public CThostFtdcSyncingInstrumentCommissionRateField CloseRatioByMoney(double CloseRatioByMoney) {
		this.io.setDoubleField(this, 6, CloseRatioByMoney);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public double CloseRatioByVolume() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public CThostFtdcSyncingInstrumentCommissionRateField CloseRatioByVolume(double CloseRatioByVolume) {
		this.io.setDoubleField(this, 7, CloseRatioByVolume);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public double CloseTodayRatioByMoney() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(8) 
	public CThostFtdcSyncingInstrumentCommissionRateField CloseTodayRatioByMoney(double CloseTodayRatioByMoney) {
		this.io.setDoubleField(this, 8, CloseTodayRatioByMoney);
		return this;
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public double CloseTodayRatioByVolume() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \u01bd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(9) 
	public CThostFtdcSyncingInstrumentCommissionRateField CloseTodayRatioByVolume(double CloseTodayRatioByVolume) {
		this.io.setDoubleField(this, 9, CloseTodayRatioByVolume);
		return this;
	}
	public CThostFtdcSyncingInstrumentCommissionRateField() {
		super();
	}
	public CThostFtdcSyncingInstrumentCommissionRateField(Pointer pointer) {
		super(pointer);
	}
}
