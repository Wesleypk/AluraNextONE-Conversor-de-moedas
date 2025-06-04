import com.google.gson.annotations.SerializedName;

public record ConversionRates(@SerializedName("ARS") double ars,
                              @SerializedName("BRL") double brl,
                              @SerializedName("COP") double cop,
                              @SerializedName("EGP") double egp,
                              @SerializedName("EUR") double eur,
                              @SerializedName("JPY") double jpy,
                              @SerializedName("KES") double kes,
                              @SerializedName("GTQ") double gtq,
                              @SerializedName("USD") double usd)

{}
