package com.pixel.sealedclssample.exsealtime;

public sealed interface TimeOfTheDay { }
final class DayTime implements TimeOfTheDay{}
final class NightTime implements TimeOfTheDay{}

