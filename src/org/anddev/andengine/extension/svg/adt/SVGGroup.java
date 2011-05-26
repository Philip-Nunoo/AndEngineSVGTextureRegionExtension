package org.anddev.andengine.extension.svg.adt;

import org.anddev.andengine.extension.svg.util.constants.ISVGConstants;


/**
 * @author Nicolas Gramlich
 * @since 12:58:32 - 24.05.2011
 */
public class SVGGroup implements ISVGConstants {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final SVGGroup mSVGroupParent;
	private final SVGProperties mSVGProperties;
	private final boolean mHasTransform;
	private final boolean mHidden;

	// ===========================================================
	// Constructors
	// ===========================================================

	public SVGGroup(final SVGGroup pSVGroupParent, final SVGProperties pSVGProperties, final boolean pHasTransform) {
		this.mSVGroupParent = pSVGroupParent;
		this.mSVGProperties = pSVGProperties;
		this.mHasTransform = pHasTransform;
		this.mHidden = this.mSVGroupParent.isHidden() || isDisplayNone();
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public boolean hasTransform() {
		return this.mHasTransform;
	}

	public SVGProperties getSVGProperties() {
		return this.mSVGProperties;
	}

	public boolean isHidden() {
		return this.mHidden;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	private boolean isDisplayNone() {
		return VALUE_NONE.equals(this.mSVGProperties.getStringProperty(ATTRIBUTE_DISPLAY, false));
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
