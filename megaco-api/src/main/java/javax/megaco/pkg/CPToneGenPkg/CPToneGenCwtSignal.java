package javax.megaco.pkg.CPToneGenPkg;

import javax.megaco.pkg.MegacoPkg;
import javax.megaco.pkg.PkgSignalItem;
import javax.megaco.pkg.DTMFGenPkg.DTMFGenPkg;

/**
 * The MEGACO Call Waiting Tone signal class extends the PkgSignalItem class.
 * This is a final class. This class defines Call Waiting Tone signal of MEGACO
 * Call Progress Tone Generator package. The methods shall define that this
 * signal item belongs to the Call Progress Tone Generator package.
 */
public final class CPToneGenCwtSignal extends PkgSignalItem {

	/**
	 * Identifies Call waiting tone signal of the MEGACO Call Progress Tone
	 * Generator Package. Its value shall be set equal to 0x0037.
	 */
	public static final int CP_TONE_GEN_CWT_SIGNAL = 0x0037;

	private CPToneGenPkg itemsPkgId = new CPToneGenPkg();

	/**
	 * Constructs a Jain MEGACO Object representing signal Item of the MEGACO
	 * Package for signal Call Waiting Tone and Package as Call Progress Tone
	 * Generator.
	 */
	public CPToneGenCwtSignal() {
		super();
		super.signalId = CP_TONE_GEN_CWT_SIGNAL;
		super.itemId = CP_TONE_GEN_CWT_SIGNAL;
	}

	/**
	 * This method is used to get the item identifier from an Item object. The
	 * implementations of this method in this class returns the id of the Call
	 * Waiting Tone signal of Call Progress Tone Generator Package.
	 * 
	 * @return It shall return {@link CP_TONE_GEN_CWT_SIGNAL}.
	 */
	public int getItemId() {

		return super.itemId;
	}

	/**
	 * This method is used to get the signal identifier from an Signal Item
	 * object. The implementations of this method in this class returns the id
	 * of the Call Waiting Tone signal of Call Progress Tone Generator Package.
	 * 
	 * @return It shall return {@link CP_TONE_GEN_CWT_SIGNAL}.
	 */
	public int getSignalId() {
		return super.signalId;
	}

	/**
	 * This method gets the package id to which the item belongs. Since the
	 * Congestion Tone signal is defined in the Call Progress Tone Generator
	 * Package of MEGACO protocol, this method returns the CPToneGenPkg class
	 * object.
	 * 
	 * @return The package is CPToneGenPkg
	 */
	public MegacoPkg getItemsPkgId() {

		return itemsPkgId;
	}

}
