
public class Glyf {

	private String name;

	protected Glyf(String name) {
		this.name = name;
	}


	public String Output(String content, TagContext context) {
		String res = "<" + getName() + " style=\"" + GetStyle(context) + "\">";
		res += content;
		res += "</" + getName() + ">";
		return res;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CssStyle GetStyle(TagContext context) {
		return context.getStyle();
	}
	
	public void SetStyle(CssStyle newStyle, TagContext context) {
		context.setStyle(newStyle);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Glyf))
			return false;
		
		final Glyf other = (Glyf) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
