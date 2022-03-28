package test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class Account {
	private String ano;
	private String owner;
	private int balance;
}
