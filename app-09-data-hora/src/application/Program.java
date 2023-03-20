package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

public static Scanner scanner;
	
	public static void main(String[] args) throws ParseException {
		
		instanciarDataHora();
		converterDataHoraParaTexto();
	}
	
	private static void converterDataHoraParaTexto() {
		
		LocalDate dataLocalConversao = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraLocalConversao = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraGlobalConversao = Instant.parse("2022-07-20T01:30:26Z");
		
		System.out.println("Impressão de Datas-Horas convertidas para Texto");
		System.out.println("Data Local:\t\t\t\t" + dataLocalConversao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data-Hora Local:\t\t\t" + dataHoraLocalConversao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("Data-Hora Local (ISO_DATE_TIME):\t" + dataHoraLocalConversao.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Data-Hora Global:\t\t\t" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(dataHoraGlobalConversao));
		System.out.println("Data-Hora Global (ISO_INSTANT):\t\t" + DateTimeFormatter.ISO_INSTANT.format(dataHoraGlobalConversao));
		System.out.println("Data-Hora Global toString():\t\t" + dataHoraGlobalConversao.toString());
	}
	
	private static void instanciarDataHora() throws ParseException {
		
		LocalDate dataLocalInstancia = LocalDate.now();
		LocalDateTime dataHoraLocalInstancia = LocalDateTime.now();
		Instant dataHoraGlobalInstancia = Instant.now();
		
		LocalDate dataLocalISO8601Instancia = LocalDate.parse("2022-07-20");
		LocalDateTime dataHoraLocalISO8601Instancia = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant dataHoraGlobalGInstancia = Instant.parse("2022-07-20T01:30:26Z");
		Instant dataHoraGlobalGMTMenos3Instancia = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).parse("2022-07-20T01:30:26-03:00").toInstant();
		
		LocalDate dataLocalFormatada = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime dataHoraLocalFormatada = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate dataLocalAnoMesDia = LocalDate.of(2022, 7, 20);
		LocalDateTime dataHoraLocalAnoMesDia = LocalDateTime.of(2022, 7, 20, 1, 30);
		
		System.out.println("Impressão de Instâncias de Datas");
		System.out.println("Data Local:\t\t\t\t\t" + dataLocalInstancia);
		System.out.println("Data-Hora Local:\t\t\t\t" + dataHoraLocalInstancia);
		System.out.println("Data-Hora Global:\t\t\t\t" + dataHoraGlobalInstancia);
		System.out.println("Data Local ISO8601:\t\t\t\t" + dataLocalISO8601Instancia);
		System.out.println("Data-Hora Local ISO8601:\t\t\t" + dataHoraLocalISO8601Instancia);
		System.out.println("Data-Hora Global ISO8601:\t\t\t" + dataHoraGlobalGInstancia);
		System.out.println("Data-Hora Global GMT-3:\t\t\t\t" + dataHoraGlobalGMTMenos3Instancia);
		System.out.println("Data Local Formatada:\t\t\t\t" + dataLocalFormatada);
		System.out.println("Data-Hora Local Formatada:\t\t\t" + dataHoraLocalFormatada);
		System.out.println("Data Local Ano-Mês-Dia:\t\t\t\t" + dataLocalAnoMesDia);
		System.out.println("Data-Hora Local Ano-Mês-Dia-Hora-Minuto:\t" + dataHoraLocalAnoMesDia);
		System.out.println();
	}
}
