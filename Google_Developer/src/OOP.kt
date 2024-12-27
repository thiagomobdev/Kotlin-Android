import kotlin.reflect.KProperty
import kotlin.properties.ReadWriteProperty


open class SmartDevice (val name: String, val category: String){
    var deviceStatus = "online"
        protected set(value){
            field = value
        }
    open val deviceType = "unknown"
    //Criando propriedades da classe.
    //Criando um construtor

    constructor(name: String, category: String, statusCode: Int) : this(name, category){
        deviceStatus = when (statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    //Uma função dentro da classe é chamada de Metodo.
    open fun turnOff(){
        println("Smart device is turned Off.")
    }
    open fun turnOn(){
        println("Smart device is turned On.")
    }

    fun printDeviceInfo(){
        println("Device name: $name, category: $category, type: $deviceType")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Tv"
    var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)
    var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 100)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }
    fun decreaseVolume(){
        speakerVolume--
        println("Speaker volume decreased to $speakerVolume.")

    }
    protected fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
    fun previousChannel(){
        channelNumber--
        println("Channel number previous to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}


class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}


class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice

){
    var deviceTurnOnCount = 0
        private set
    fun turnOnTv(){
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }
    fun turnOffTv(){
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }
    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }
    fun changeChannelToNext(){
//        smartTvDevice.increaseChannelNumber()
    }
    fun turnOnLight(){
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }
    fun turnOffLight(){
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }
    fun increaseLightBrightness(){
        smartLightDevice.increaseBrightness()
    }
    fun turnOffAllDevices(){
        turnOffTv()
        turnOffLight()
    }
}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {
    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>) : Int{
        return fieldData
    }
    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int){
        if(value in minValue..maxValue){
            fieldData = value
        }

    }
}

fun main(){
 var smartDevice: SmartDevice = SmartTvDevice("Android TV","Entertainment")
    smartDevice.turnOn()
    smartDevice = SmartLightDevice("Google Light", "Utility")
}